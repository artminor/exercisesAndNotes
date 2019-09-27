x = 102
print(x)
# //rounds(floor) after division
print(x // 3)

f = False
print(f + 10)

print(10 == '10')  #False

print(4 < 5 and 5 > 3)

x = '40'
y = '5'
print(type(x))
print(x + y)

# lists
test_scores = [100, 23, 94, 75, 97]
fruit_types = ['apple', 'banana', 'orange']

# lists are mutable
# strings are immutable?
print(test_scores[1:4])
print(test_scores[2])
print(test_scores[-1])

# dictionaries
my_info = {
    'name': 'Jun',
    'title': 'software engineer',
    'pets': ['Tofu'],
    'age': 28,
    'favorite_things': {
        'subway_line': ['A', 'B', 'D', '7'],
        'show': ['Dexter']
    }
}

print(my_info['name'])

my_pets = my_info['pets']
print(my_pets[0])
print(my_info['age'])
print(my_info['favorite_things']['subway_line'][3])

#conditional code indentation matters
sky_is_dark = True
if sky_is_dark:
    print('it\'s night time!')
else:
    print('it\'s day time')

for subway in my_info['favorite_things']['subway_line']:
    print(subway + ' train is here!')

sum = 0
counter = 0
while counter < 10:
    sum = sum + counter
    print(sum)
    counter += 1
    print(counter)
print('The final sum is ' + str(sum))


#function
def my_function():
    print('I love Python!')


my_function()


def hey(name):
    print('hey', name)


hey('sam')

def add_five(num):
	return 5+num

print(add_five(10))