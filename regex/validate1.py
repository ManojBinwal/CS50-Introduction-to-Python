email = input("What's you e-mail? ").strip()

username,domain = email.split("@")

if username and "." in domain:
    print("Valid")
else:
    print("Invalid")