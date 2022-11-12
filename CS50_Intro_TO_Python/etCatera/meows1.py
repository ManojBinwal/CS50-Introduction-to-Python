def meow(n: int):              #giving hint that n is int     #mypy check
    for _ in range(n):
        print("meow")

number: int = int(input("number: "))
meow(number)