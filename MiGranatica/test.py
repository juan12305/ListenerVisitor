from antlr4 import *
from MiGramaticaLexer import MiGramaticaLexer  
from MiGramaticaParser import MiGramaticaParser  

input_stream = InputStream(input('? '))
lexer = MiGramaticaLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = MiGramaticaParser(token_stream)
tree = parser.programa()  

print(tree.toStringTree(recog=parser))