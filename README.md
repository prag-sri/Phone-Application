# Phone-Application

Phones can be of two types based on which their functionalities will also be different:-
1)LandLine
2)MobilePhone

Both Landline and MobilePhone will have their phone nos.- So both types of phones will have common functionalities like- 
1)dialNo - 
calling a person by dialing a no.
We will take phone no. as input from the user and then if will display "Calling 'phone no."

2)ansPhoneCall - the phone is ringing, phone no. of the person calling is displayed on the screen- user will give input true and false- if true then the phone is picked up otherwise call is cut

These functions are common so they will be declared in the interface and both Landline and MobilePhone will implement the Interface name PhoneInterface

Other than the above-mentioned functions, there can be functions specific to a particular phone type.


MobilePhone can have other functions like:-
1)powerOn-
If powerOn is true then only perform functions on phone- otherwise you cannot dial a no. or receive any call. powerOn will be initially declared as false that is by default the mobile phone is switched off. It needs to be switched on first; only we can perform any other functions.
