import math

# Lê as coordenadas dos pontos
x1, y1 = map(float, input().split())
x2, y2 = map(float, input().split())

# Calcula a distância entre os pontos
distancia = math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))

# Imprime a distância com 4 casas decimais
print(f"{distancia:.4f}")
