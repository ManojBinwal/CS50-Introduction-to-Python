def total(galleons=1, sickles=1, knuts=1):
    return(galleons * 17 + sickles) * 29 + knuts

coins = {"galleons": 100, "sickles": 50, "knuts":25}

print(total(**coins), "knuts")

#  **coins is used to unpack dictionary
#  * to unpack list