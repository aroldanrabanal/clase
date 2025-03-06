#1
password = input('Introduce la contraseña: ')
if password in ['sesamo']:
    print('Pasa')
else:
    print('No pasa')

#2
base = float(input('Introduce la base imponible de la factura: '))
iva = 0.21
def aplica_iva(base, iva):
    base = base * iva
    return base
print(aplica_iva(base, iva))

#3
u = (1, 2, 3)
v = (4, 5, 6)
def producto_escalar(u, v):
    prod = 0
    for i in range(len(u)):
        prod += u[i] * v[i]
    return prod

print(producto_escalar(u, v))

#4
listin = {'Juan': 123456789, 'Pedro': 987654321}

def elimina(listin, usuario):
    if usuario in listin:
        telefono = listin[usuario]
        del listin[usuario]
        return telefono
    else:
        return f"El usuario {usuario} no está en el listín."

print(elimina(listin, 'Pedro'))

#5
a = ((1, 2, 3),
    (3, 2, 1))
b = ((1, 2),
    (3, 4),
    (5, 6))
def producto(a, b):
    producto = []
    for i in range(len(a)):
        fila = []
        for j in range(len(b[0])):
            suma = 0
            for k in range(len(b)):
                suma += a[i][k] * b[k][j]
            fila.append(suma)
        producto.append(tuple(fila))
    return tuple(producto)

print(producto(a, b))

#6)
def procesar_datos(datos):
    resultados = []
    numeros = []
    for dato in datos:
        if isinstance(dato, (int, float)):
            if dato > 0:
                resultado = dato * 2
                numero = resultado
            elif dato == 0:
                resultado = "Cero"
            else :
                resultado = abs(dato / 2)
                numero = resultado

            numeros.append(numero)
            resultados.append(resultado)

        else:
            print("Dato Omitido")

    promedio = sum(numeros) / len(datos)
    return promedio, resultados
lista_datos = [10, -3, 0, 'a', 5, -8]
promedio, resultados = procesar_datos(lista_datos)
print("Promedio de los resultados:", promedio)
print("Lista de resultados procesados:", resultados)