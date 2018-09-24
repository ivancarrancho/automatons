import sys
_input = input('Ingrese la cadena: ')
accepted = True

size = len(_input)
index = 0

if _input == 'fin':
    sys.exit()


def q2(index, size, _input, letra1):
    if(index < size and _input[index] == letra1):
        index += 1

        if(index < size and _input[index] == 'a'):
            q1(index=index, size=size, _input=_input, letra2='a')

        if(index < size and _input[index] == 'b'):
            index += 1

            if(index < size and _input[index] == 'a'):
                index += 1

                while index < size and (
                    _input[index] == 'b' or
                    _input[index] == 'c'
                ):
                    index += 1
                pass
        else:
            return False


def q1(index, size, _input, letra2):
    if(index < size and _input[index] == letra2):
        index += 1

        if(index < size and _input[index] == 'c'):
            q2(index=index, size=size, _input=_input, letra1='c')

        if index < size and _input[index] == 'b':
            index += 1

            if(index < size and _input[index] == 'a'):
                index += 1

                while index < size and (
                    _input[index] == 'b' or
                    _input[index] == 'c'
                ):
                    index += 1
                pass
        else:
            return False


if(index < size and _input[index] == 'a'):
    index += 1

    if(index < size and _input[index] == 'b'):
        index += 1

        if(index < size and _input[index] == 'a'):
            index += 1

            while index < size and (
                _input[index] == 'b' or
                _input[index] == 'c'
            ):
                index += 1
            pass

    if(index < size and _input[index] == 'c'):
        accepted = q2(index=index, size=size, _input=_input, letra1='c')

        if(index < size and _input[index] == 'a'):
            accepted = q1(index=index, size=size, _input=_input, letra2='a')

    else:
        accepted = False

if(index < size and (_input[index] == 'b' or _input[index] == 'c')):
    index += 1

    if(index < size and _input[index] == 'a'):
        q1(index=index, size=size, _input=_input, letra2='a')

    if(index < size and _input[index] == 'b'):
        index += 1

        if(index < size and _input[index] == 'a'):
            index += 1

            while(index < size and (_input[index] == 'b' or  _input[index] == 'c')):
                index += 1
            pass
    else:
        print('false3')
        accepted = False
else:
    print('false4')
    accepted = False


if index != size:
    print('false5')
    accepted = False


if accepted:
    print("Cadena Aceptada")
else:
    print("Cadena Rechazada")
