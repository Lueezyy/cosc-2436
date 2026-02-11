kg = float(input("Enter the amount of water in kilograms: "))
t0 = float(input("Enter the initial temperature: "))
t1 = float(input("Enter the final temperature: "))
q = kg * (t1-t0) * 4184
print(f"The energy needed is {q}")