def main():
    x=get_int("what's x? ")
    print(f"value of x is {x}")

def get_int(prompt):
    while(True):
        try:
            z = int(input(prompt))
            return z
        except ValueError:
            pass

main()