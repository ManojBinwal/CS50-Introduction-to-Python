import re

email = input("what's your email? ").strip()

if re.search(r"^\w+@+\w+\.(edu|org|com|in|en)$", email,re.IGNORECASE):
    print("Valid")

else:
    print("Invaild")