from MiGramaticaParser import MiGramaticaParser
from MiGramaticaVisitor import MiGramaticaVisitor

class EvalVisitor(MiGramaticaVisitor):
    def __init__(self):
        self.variables = {}  # Diccionario para almacenar variables
        self.debug = True    # Modo depuración (mostrar pasos)

    def visitPrograma(self, ctx):
        for sentencia in ctx.sentencia():
            self.visit(sentencia)
        return self.variables

    def visitForLoop(self, ctx):
        if self.debug:
            print("\n[FOR] Iniciando bucle")
        
        # 1. Ejecutar inicialización (ej: i = 0)
        self.visit(ctx.inicializacion())
        
        # 2. Evaluar condición en cada iteración
        while True:
            condicion = self._evaluar_condicion(ctx.condicion())
            if self.debug:
                print(f"[DEBUG] Condición: {ctx.condicion().getText()} → {condicion}")
            
            if not condicion:
                break
            
            # 3. Ejecutar cuerpo del for
            if self.debug:
                print("[DEBUG] Ejecutando cuerpo del for...")
            for sentencia in ctx.sentencia():
                self.visit(sentencia)
            
            # 4. Ejecutar actualización (ej: i = i + 1)
            if self.debug:
                print("[DEBUG] Actualizando variable...")
            self.visit(ctx.actualizacion())
        
        if self.debug:
            print("[FOR] Bucle terminado")

    def _evaluar_condicion(self, condicion_ctx):
        var = condicion_ctx.ID().getText()
        op = condicion_ctx.op.text
        valor = int(condicion_ctx.INT().getText())
        actual = self.variables.get(var, 0)
        
        # Evaluar condición
        if op == '<': return actual < valor
        elif op == '>': return actual > valor
        elif op == '==': return actual == valor
        elif op == '!=': return actual != valor
        else: return False

    def visitAssign(self, ctx):
        var = ctx.ID().getText()
        valor = self.visit(ctx.expresion())
        self.variables[var] = valor
        if self.debug:
            print(f"[ASIGNACIÓN] {var} = {valor}")

    def visitAddSub(self, ctx):
        izquierda = self.visit(ctx.expresion(0))
        derecha = self.visit(ctx.expresion(1))
        op = ctx.op.text
        return izquierda + derecha if op == '+' else izquierda - derecha

    def visitMulDiv(self, ctx):
        izquierda = self.visit(ctx.expresion(0))
        derecha = self.visit(ctx.expresion(1))
        op = ctx.op.text
        return izquierda * derecha if op == '*' else izquierda / derecha

    def visitInt(self, ctx):
        return int(ctx.INT().getText())

    def visitVariable(self, ctx):
        var = ctx.ID().getText()
        return self.variables.get(var, 0)

    def visitInicializacion(self, ctx):
        var = ctx.ID().getText()
        valor = self.visit(ctx.expresion())
        self.variables[var] = valor
        if self.debug:
            print(f"[INICIALIZACIÓN] {var} = {valor}")

    def visitActualizacion(self, ctx):
        var = ctx.ID().getText()
        valor = self.visit(ctx.expresion())
        self.variables[var] = valor
        if self.debug:
            print(f"[ACTUALIZACIÓN] {var} = {valor}")