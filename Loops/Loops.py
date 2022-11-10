def main():
    number = get_input()
    meow(number)


def meow(n):
    for i in range(n):
        print("meow")

def get_input():
    n = int(input("How many meow's "))
    return n

main()