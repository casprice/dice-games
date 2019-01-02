import random

total = 0

while True:
    print('\nWelcome to the Dice Game!\n')
    num = int(input('Enter how many dice you want to roll: '))

    for x in range(num):
        rand = random.randint(1, 6)
        total += rand
        print('Die #' + str(x + 1) + ': ' + str(rand))

    print('\nTotal = ' + str(total))

    response = ''
    while response != 'Y' and response != 'N':
        print('\nWould you like to roll again? (Y/N)')
        response = input()
        if response == 'Y' or response == 'N':
            break
        print('Invalid response.')
    if response == 'N':
        break

print('Thanks for playing!')
