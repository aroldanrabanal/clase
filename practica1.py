#Actividad 1
lista = ["Informática", "Francés", "Filosofía", "Ética", "Álgebra"]

for asig in lista:
    print(asig)

#Actividad 2
a = (1, 2, 3)
b = (-1, 0, 2)
product = 0
for i in range(len(a)):
    product = a[i] * b[i]

print(f"El producto de los vectores {a} y {b} es {product}")

#Actividad 3
cad = "Como quieres que te quiera si el que quiero que me quiera no me quiere como quiero que me quiera"

def count_words(cadena):
    cadena = cadena.lower()
    cadena = cadena.split()
    words = {}
    for i in cadena:
        if i in words:
            words[i] += 1
        else:
            words[i] = 1
    return words

def most_common(words):
    max_word = ""
    max_freq = 0
    for word, freq in words.items():
        if freq > max_freq:
            max_freq = freq
            max_word = word
    return max_word, max_freq

print(count_words(cad))
print(most_common(count_words(cad)))

#Actividad 4
passw = "12345EDD"
cont = ""
while cont != passw:
    cont = input("Ingrese una palabra que desea continuar: ")
    if cont != passw:
        print("Esta mal")
    else:
        print("Esta bien")

#Actividad 5
frase = input("Ingrese una frase: ")
letra = input("Ingrese una letra: ")
contador = 0
for i in frase:
    if i == letra:
        contador = contador + 1
print(f"La letra {letra} aparece {contador} veces en la frase {frase}")

#Actividad 6
a = [[1, 2, 3],
     [4, 5, 6]]
b = [[-1, 0],
     [0, 1],
     [1, 1]]
result = [[0, 0],
          [0,0]]

for i in range(len(a)):
    for j in range(len(b[0])):
        for k in range(len(b)):
            result[i][j] += a[j][k] * b[k][j]

for i in range(len(result)):
    result[i] = tuple(result[i])
result = tuple(result)
for i in range(len(result)):
    print(result[i])

#Actividad 7
precios = (50, 75, 46, 22, 80, 65, 8)
menor = 0
mayor = 0
for precio in precios:
    if precio > mayor:
        mayor = precio
    elif precio < menor:
        menor = precio

print(f"El mayor es {mayor} y el menor es {menor}")


#Actividad 8
def to_decimal(n):
    n = list(n)
    n.reverse()
    decimal = 0
    for i in range(len(n)):
        decimal += int(n[i]) * 2 **i
    return decimal

def to_binary(n):
    binary = []
    while n > 0:
        binary.append(str(n % 2))
        n = n // 2
    binary.reverse()
    return "".join(binary)

print(to_decimal("10110"))
print(to_binary(22))
print(to_decimal(to_binary(22)))
print(to_binary(to_decimal("10110")))