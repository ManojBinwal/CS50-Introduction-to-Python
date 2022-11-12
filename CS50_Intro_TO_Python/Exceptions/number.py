while(True):
    try:
        #if the value error happens first then x will not be evaluated and hence will not be created
        x = int(input("what's the value of x? "))
       # break - using break here is completely fine removing else statement
    except ValueError:
        print("x is not integer")
    else:
        break
print("x is " , x)