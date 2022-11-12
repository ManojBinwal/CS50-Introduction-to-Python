class Account:
    def __init__(self):
        self.balance = 0

    @property
    def balance(self):
        return self._balance

    def deposit(self,n):
        self._balance += n

    def withdraw(self,n):
        self._balance -= n
