number = int(input())
count = 0 # 개수를 세는 변수
sum = 0 # 총합을 구하는 변수
list = []

# 약수의 개수, 총합 구하기
for i in range(1,number + 1):
    if(number % i == 0):
        list.append(i)
        count+=1
        sum+=i
print(number,"의 약수의 개수:",count,"|","약수의 총합:",sum)
