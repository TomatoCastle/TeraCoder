import sys

for i in range(0,int(input())):
    a = input()
    b = input()
    after = []

    for j in list(a):
        c = int(ord(j)) + 1
        if c == 91:
            c = 65
        after.append(chr(c))
    print('Case #{}:'.format(i + 1))
    if b == ''.join(after):
        print('OK')
        continue
    for j in list(a):
        c = int(ord(j)) - 1
        if c == 64:
            c = 90
        after.append(chr(c))
    if b == ''.join(after):
        print('OK')
    else:
        print('NG')

