# №1. Напишите программу, которая является квадратом другого числа.
    # *Примеры:*
    # - 5, 25 -> да
    # - 4, 16 -> да
    # - 25, 5 -> да
    # - 8,9 -> нет


print('введите число a: ')
a = int(input())
print('введите число b: ')
b = int(input())
if a == b **2 or b == a **2:
    print('да')
else:
    print('нет')