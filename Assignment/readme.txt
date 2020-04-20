The assignment that I’ve choose is the Machine Learning model, using Naïve Bayes. 
 The program is built from 6 classes: Control class, Data class, FileManager class, Interface class, NaiveBayes class, and TrainingTesting class. 

The Interface class is called using the object created in main in Control class.
 The GUI uses JFrame to display the interface. The interface contains numerous Check Boxes, Buttons and Labels. 
 It also contains a Combo Box from where the user can select its temperature. 
 
By pressing Test symptoms, a new Data type object is created using the user input and it makes an array list Data type which stores the values from data base. 
 The FileManager gets the file name and based on it, it establishes a Data object for each entry and returns an array list of Data type.
 
After this, the NaiveBayes is called (using an object) to calculate the diagnose based of the user input.
 An appropriate message is displayed with the diagnose.
 
By pressing Test Accuracy button, class TrainingTesting is called (by an object) and it returns the classifier accuracy (in percentage).
 Inside TrainingTesting class, the data is divided randomly into test data and training data (30% and 70%) and calculate the accuracy,
 calling NaiveBayes class and comparing to the actual data.

If I will have more time to improve it, I could make the GUI to look better and to insert the database from GUI (to browse for it).   

 github:https://github.com/ZUGRII/JAVA