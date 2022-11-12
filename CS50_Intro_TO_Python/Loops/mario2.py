def main():
    print_Square(3)

def print_Square(size):
        #for each row in square:
    for i in range(size):
        # for each element in row:
        for j in range(size):
            print("#",end="")
        print()

main()