**Bean Scope:**		                       
              Bean scope is something that we define with the **@Scope annotation** which tells the application context/ IOC container about how that particular bean should be created and presented throughout the application lifecycle.

**Types of Bean Scope:**

**1.	Singleton scope**     
**2.	Prototype scope**      
 **3.	Request scope  
4.	Session scope  
5.	Application scope:**



**Singleton scope:**    
•	Singleton is a default scope.     
•	Only one instance is created per IOC.      
•	Early initialized by IOC (means at the time of application startup the objects are created ).      




**Prototype scope:**    
•	Each time new object is created .      
•	It’s a LAZY initialized, means the object is created when it is needed.   


**Request scope:**    
•	A new object is created for each HTTP Request.    
•	Lazily initialized.    


**Session scope :**          
•	New object is created for each HTTP session.      
•	Lazily initialized.      
•	When user access any endpoint session is created.     
•	Remains active till it does not expire.      


**Application scope:**    
Similar to Singleton: singleton say one object in one IOC container.     
Application scope: say One object across multiple IOC container.      

