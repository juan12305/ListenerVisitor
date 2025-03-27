from antlr4 import *
from MiGramaticaLexer import MiGramaticaLexer
from MiGramaticaParser import MiGramaticaParser
from MiGramaticaListener import MiGramaticaListener

class MyListener(MiGramaticaListener):
    def __init__(self):
        self.indent = 0
    
    def enterForLoop(self, ctx):
        print(" " * self.indent + "🔄 FOR detectado")
        self.indent += 2
    
    def exitForLoop(self, ctx):
        self.indent -= 2
    
    def enterInicializacion(self, ctx):
        print(" " * self.indent + f"⚙️ Inicialización: {ctx.getText()}")
    
    def enterCondicion(self, ctx):
        print(" " * self.indent + f"🔍 Condición: {ctx.getText()}")
    
    def enterActualizacion(self, ctx):
        print(" " * self.indent + f"🔄 Actualización: {ctx.getText()}")
    
    def enterAssign(self, ctx):
        print(" " * self.indent + f"📌 Asignación: {ctx.getText()}")

def main():
    input_text = input("Ingrese código (ej: 'for (i=0;i<3;i=i+1){x=2;}'): ")
    lexer = MiGramaticaLexer(InputStream(input_text))
    parser = MiGramaticaParser(CommonTokenStream(lexer))
    tree = parser.programa()
    listener = MyListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

if __name__ == "__main__":
    main()