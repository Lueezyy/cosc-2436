subtotal, gratuity = map(float, input("Enter subtotal and gratuity rate: ").split())
tip = gratuity/100  * subtotal
print(f"The gratuity is {gratuity} total is {subtotal + tip}")