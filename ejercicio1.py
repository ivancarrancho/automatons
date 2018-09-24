import sys

num_list = [
    '',
    '011',
    '0110',
    '00011',
    '0101',
    '000110',
    '00000000100000001',
    '000000001000000010',
    '0000000010000000111111111110',
    '00011',
    '000111111111111',
    '10000',
    '101010',
    '101010101010101010',
    '010000100',
    '010000100010000100010000100',
    '0001100',
    '000110000011000001100',
    '1',
    '0',
    '010',
]


def automata(_input):
    accepted = True
    size = len(_input)
    index = 0

    if _input == 'fin' or _input == 'FIN':
        sys.exit()

    if(index < size and _input[index] == '0'):
        index += 1

        while(index < size and _input[index] == '0'):
            index += 1

        if(index < size and _input[index] == '1'):
            index += 1

            while(index < size and _input[index] == '0'):
                index += 1

            if(index < size and _input[index] == '1'):
                index += 1

                while(index < size and _input[index] == '1'):
                    index += 1

                if(index < size and _input[index] == '0'):
                    index += 1
        else:
            accepted = False
    elif size == 0:
        accepted = True
    else:
        accepted = False

    if index != size:
        accepted = False

    if accepted:
        print('Cadena Aceptada {}'.format(_input))
    else:
        print('Cadena Rechazada {}'.format(_input))


try:
    opt = input(
        '********** Manual presione 1\n********** Auto presione 2 \n\n'
    )

    if opt == 1:
        _input = input('Ingrese la cadena: ')
        if not isinstance(_input, str):
            print('{} debe ser un string'.format(opt))
            sys.exit()

        automata(_input)

    elif opt == 2:
        for _input in num_list:
            automata(_input)
    else:
        print('{} No es una opcion valida'.format(opt))

except Exception:
    print('Formato invalido')
