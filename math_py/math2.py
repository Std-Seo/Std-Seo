# 30 이상의 두 자리 자연수 중 짝수의 개수
count = 0
for i in range(30, 100):
    if(i % 2 == 0):
        count += 1
        print(i)
print("짝수의 개수는",count,"개입니다.")
print()

# 20 이상 70 미만인 두 자리 수 중 5의 배수의 개수
count = 0
for i in range(20, 70):
    if(i % 5 == 0):
        count += 1
        print(i)
print("5의 배수의 개수는",count,"개입니다.")