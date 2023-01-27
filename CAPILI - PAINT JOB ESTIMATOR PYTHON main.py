# SECOND PROGRAMMING EXERCISE:

print("Good Day Sir Jobert!")
print("I'll be your assistant for today!")
print ("Kindly please enter the area of the wall in Square Feet)")
wallArea = (float(input("")))
print ("Enter the price of the paint per gallon (USD)")
paintPrice = (float(input("")))
print()

paintGallon = wallArea/115
# 1 Gallon of Paint = 115squareft
totalLaborTime = paintGallon*8
# 8 Hours of Labor = 1 Gallon of Paint

paintCost = paintGallon*paintPrice
laborCost = totalLaborTime*20
# 20 Dollars = 8 Hours of Labor

totalCost = laborCost + paintCost

laborTimeHoursInt = (int(totalLaborTime))
# Converting to Int to obtain the whole number or hours only
laborTimeMinutesFloat = (float(totalLaborTime - laborTimeHoursInt))
# Subtracting the whole number from the total to obtain minutes
laborTimeMinutesInt = (int(60*laborTimeMinutesFloat))
# Converting minutes from decimal form in hours into minutes

paintCostString = "{:.2f}".format(paintCost)
paintGallonString = "{:.2f}".format(paintGallon)
laborCostString = "{:.2f}".format(laborCost)
totalCostString = "{:.2f}".format(totalCost)

if(paintGallon == 1):
    print("The Gallons of paint required: " + paintGallonString + " gallon of paint")
else:
    print("The Gallons of paint required: " + paintGallonString + " gallons of paint")

if(laborTimeMinutesInt == 0):
    print("Tadah! It'll take" , laborTimeHoursInt , "Hours")
else:
    print("It will take" , laborTimeHoursInt , "Hours and" , laborTimeMinutesInt , "Minutes")
print("The paint will cost $" + paintCostString)
print("The labor will cost $" + laborCostString + " at a rate of $20 per hour")
print("Overall, Your total cost equates to: $"+ totalCostString)

#SUBMITTED BY: ANDREI N CAPILI (BSCPE 1-1 - PUP BC)