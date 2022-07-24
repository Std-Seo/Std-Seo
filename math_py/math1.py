# 2x+y=5를 만족시키는 음이 아닌 정수의 순서쌍 구하기
x = 0
y = 0
for x in range(0, 6):
    for y in range(0, 6):
        if(2 * x + y == 5):
            print("(",x,",",y,")")
print()

# x+4y=10를 만족시키는 음이 아닌 정수의 순서쌍 구하기
for x in range(0, 11):
    for y in range(0, 11):
        if(x + 4*y == 10):
            print("(",x,",",y,")")

# x+y<=4를 만족시키는 자연수 순서쌍 구하기
for x in range(1,5):
    for y in range(1,5):
        if(x+y <= 4):
            print("(",x,",",y,")")