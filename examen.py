def agregar(pokemons):
    nombre = input("Ingrese el nombre del Pokémon: ")
    tipo = input("Ingrese el tipo del Pokémon: ")
    nivel = int(input("Ingrese el nivel del Pokémon: "))
    pokemons.append({"nombre": nombre, "tipo": tipo, "nivel": nivel})
    print("Pokémon agregado con éxito.")

def mostrar(pokemons):
    if pokemons:
        print("Lista de Pokémon capturados:")
        for pokemon in pokemons:
            print(f"- Nombre: {pokemon['nombre']}, Tipo: {pokemon['tipo']}, Nivel: {pokemon['nivel']}")
    else:
        print("No hay Pokémon capturados.")

def buscar(pokemons):
    tipo_buscado = input("Ingrese el tipo de Pokémon a buscar: ")
    encontrados = [pokemon for pokemon in pokemons if pokemon['tipo'].lower() == tipo_buscado.lower()]
    if encontrados:
        print("Pokémon de tipo", tipo_buscado + ":")
        for pokemon in encontrados:
            print(f"- Nombre: {pokemon['nombre']}, Nivel: {pokemon['nivel']}")
    else:
        print("No se encontraron Pokémon de ese tipo.")

def eliminar(pokemons):
    nombre = input("Ingrese el nombre del Pokémon a eliminar: ")
    for i, pokemon in enumerate(pokemons):
        if pokemon['nombre'].lower() == nombre.lower():
            del pokemons[i]
            print("Pokémon eliminado con éxito.")
            return
    print("No se encontró un Pokémon con ese nombre.")
    
def subir_nivel(pokemons):
    nombre = input("Ingrese el nombre del Pokémon a subir de nivel: ")
    niveles = int(input("Ingrese el número de niveles a incrementar: "))
    for pokemon in pokemons:
        if pokemon['nombre'].lower() == nombre.lower():
            pokemon['nivel'] += niveles
            print(f"El nivel de {pokemon['nombre']} ha sido incrementado a {pokemon['nivel']}.")
            return
    print("No se encontró un Pokémon con ese nombre.")

def main():
    pokemons = []
    while True:
        print("1. Agregar un Pokémon")
        print("2. Mostrar todos los Pokémon")
        print("3. Buscar Pokémon por tipo")
        print("4. Eliminar un Pokémon")
        print("5. Subir de nivel un Pokémon")
        print("6. Salir")
        opcion = input("Seleccione una opción: ")
        match opcion:
            case "1":
                agregar(pokemons)
            case '2':
                mostrar(pokemons)
            case '3':
                buscar(pokemons)
            case '4':
                eliminar(pokemons)
            case '5':
                subir_nivel(pokemons)
            case '6':
                print("Saliendo del programa.")
                break

if __name__ == "__main__":
    main()