# week 3 lab report
## Part 1
After `/add-message?s=Hello&user=jpolitz`
![Image](截屏2024-01-28 下午2.14.44.png)

For this screenshot, there are the methods my code called:

`url.getPath().contains("/add-message")`- there is no argument for .getPath

`url.getPath().contains("/add-message")`- the argument of .contains is "/add-message"

`url.getQuery()` - not argument 

`query.split("&")` - argument is "&"

`parameter.split("=")` - argument is "="

`keyValue[0].equals("s")` - argument is "s"

`keyValue[1].replace("+", " ")` - argument is "s"

`messages.add(message)` - argument is `messages`

`eyValue[0].equals("user")` - argument is "user"

`messages.add(message)` - argument is `messages`

`users.add(user)` - argument is `users`

`toString(users,messages)` - argument is `users` and `messages`

The value of the arraylist `messages` in the Handler class is [Hello]. The value of the arraylist `users` in the Handler class is [jpolitz]. 
`messages.add(message)` adds the `message` string to the field `message` in the Handler class, and `users.add(user)` adds the `user` string to the field `users`.

After `/add-message?s=How are you&user=yash`
![Image](截屏2024-01-28 下午2.17.48.png)

For this screenshot, there are the methods my code called:

`url.getPath().contains("/add-message")`- there is no argument for .getPath

`url.getPath().contains("/add-message")`- the argument of .contains is "/add-message"

`url.getQuery()` - not argument 

`query.split("&")` - argument is "&"

`parameter.split("=")` - argument is "="

`keyValue[0].equals("s")` - argument is "s"

`keyValue[1].replace("+", " ")` - argument are "+" and " "

`messages.add(message)` - argument is `messages`

`eyValue[0].equals("user")` - argument is "user"

`messages.add(message)` - argument is `messages`

`users.add(user)` - argument is `users`

`toString(users,messages)` - argument is `users` and `messages`

The value of the arraylist `messages` in the Handler class is [Hello, How are you]. The value of the arraylist `users` in the Handler class is [jpolitz, yash]. 
`messages.add(message)` adds the `message` string to the field `message` in the Handler class, and `users.add(user)` adds the `user` string to the field `users`.

## Part 2
The absolute path to the private key is `/Users/giwenxu/.ssh/id_rsa`. 
The absolute path to the public key is `/Users/qiwenxu/.ssh/id_rsa.pub`.

The pictures of the paths of both key.
![Image](截屏2024-01-25 上午11.27.06.png)

![Image](截屏2024-01-29 下午2.54.00.png)

The picture of log into the ieng6 account without being asked for a password.

![Image](截屏2024-01-29 下午2.57.49.png)


