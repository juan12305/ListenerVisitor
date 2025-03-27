python test_listener.py
for (i = 0; i < 3; i = i + 1) { x = x + 2; };
[FOR] Iniciando bucle...
[INICIALIZACIÓN] i = 0
[CONDICIÓN] i (0) < 3 → True
[ASIGNACIÓN] x = 2
[ACTUALIZACIÓN] i = 1
[CONDICIÓN] i (1) < 3 → True
[ASIGNACIÓN] x = 4
[ACTUALIZACIÓN] i = 2
[CONDICIÓN] i (2) < 3 → True
[ASIGNACIÓN] x = 6
[ACTUALIZACIÓN] i = 3
[CONDICIÓN] i (3) < 3 → False
[FOR] Bucle terminado

➡ Variables finales: {'i': 3, 'x': 6}

python test_visitor.py
for (i = 0; i < 3; i = i + 1) { x = x + 2; };
🔄 FOR detectado
  ⚙️ Inicialización: i=0
  🔍 Condición: i<3
  🔄 Actualización: i=i+1
  📌 Asignación: x=x+2