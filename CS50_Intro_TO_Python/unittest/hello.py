def main():
    name = input("What's your name? ")
    print(hello(name))

def hello(to="world"):
    return f"hello, {to}"          #pytest check the return values therefore return something

if __name__ == "__main__":
    main()