email = input("What's you e-mail? ").strip()

if "@" in email and "." in email:
    print("valid")
else:
    print("Invalid")