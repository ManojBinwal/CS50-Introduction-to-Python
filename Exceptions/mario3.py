def main():
    height = int(input("what's the height of pyramid: "))
    pyramid(height)

def pyramid(n):
    for i in range(n):
        print("#"*(i+1))

#use print to debug codes

main()