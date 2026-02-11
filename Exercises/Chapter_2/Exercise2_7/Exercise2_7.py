mins = int(input("Enter the number of minutes: "))
years = (mins // (60*24)) // 365
days = (mins // (60*24)) % 365
print(f"{mins} minutes is approximately {years} years and {days} days")