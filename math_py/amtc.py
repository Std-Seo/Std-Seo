pm = input("어떤 연산을 하시겠어요? ")
a, b = input("연산할 두 숫자를 입력해주세요!").split()
a = int(a)
b = int(b)

if pm == "+" :
    print(a, "+", b,"의 값은", a+b,"입니다!")
if pm == "-" :
    print(a, "-", b,"의 값은", a-b,"입니다!")
if pm == "*" :
    print(a, "*", b,"의 값은", a*b,"입니다!")
if pm == "/" :
    print(a, "/", b,"의 값은", a/b,"입니다!")
if pm == "%" :
    print(a, "/", b,"의 나머지 값은", a%b,"입니다!")