# 두 자리 자연수 중에서 십의 자리 + 일의 자리 숫자가 짝수인 개수
count = 0
for i in range(1, 10):
    for j in range(0, 10):
        if(i + j) % 2 == 0:
            count+=1
            print(i,j)

print(count,'개')