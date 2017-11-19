t = int(input())
f =[]
f.append(1)
f.append(1)
for i in range(2,46):
    f.append(f[i-2] + f[i-1])

p = [True] * len(f)+1
p[0] = False
p[1] = False
for i in range(2,len(p)):
    if p[i]:
        for 

for i in range(0,t):

    print('Case #{}:'.format(i + 1))

