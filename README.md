# AndroidFragVmDemo1

Android Fragment/ViewModel Demo 1


Developer
=========

Charles Tatum II


Abstract
========

This is a demo project to illustrate, in a VERY simple way, how to use both Android's ViewModel object and data binding
(DataBindingUtil) in a Kotlin context.  This was written out of personal necessity, as the vast majority of examples online
presented this concept using Java. As Android named Kotlin the new official language of the platform, the number of examples
online demonstrating the ViewModel concept was sparse (as of November 2019). 

This is not a particularly complicated or sophisticated example. The app asks the user to type in three properties of a
television station - its callsign (the 3- or 4-letter code starting with a "W" or "K" in the US, or a "C" in Canada), the
city to which such station is licensed, and a channel number. Upon entry of these three properties, the user clicks the 
Submit button, changing the display TextView controls in the upper half of the screen.

This project began with the default empty project, created by Android Studio using the Fragment/ViewModel template. The
methodology here can be applied to an Activity as well, copying much of the body code from the Fragment's onCreateView
method to the Activity's onCreate method. 

A key lesson I learned during the development process was that the ViewModel and data binding are two separate concepts.
One can be used without the other. Had I chosen to exclude data binding from this project, I would have had to have
substituted findViewById instructions at appropriate places in the code. Likewise, had this project been developed without
a ViewModel but with data binding, the UI XML file would still have the requisite @{} markings where data bound values
would be "poured in" to the various UI controls. It's easy for a novice to think that ViewModels and data binding are
the same thing, but they're not - they travel closely in MVVM circles but they can be used separate from one another -
they're just not usually likely to be.

This project is educational, but the Kotlin code can certainly be incorporated into larger projects. 
