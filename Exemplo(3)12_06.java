����   7 Y  Exemplo3  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LExemplo3; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  [[I
     java/lang/Math ! " random ()D@Y      
  & ' ( round (D)J	  * + , out Ljava/io/PrintStream;   . / 0 makeConcatWithConstants (I)Ljava/lang/String;
 2 4 3 java/io/PrintStream 5 6 print (Ljava/lang/String;)V 8 
..........................
 2 : ; 6 println
  = >  close args [Ljava/lang/String; ler Ljava/util/Scanner; m i I j StackMapTable 
SourceFile Exemplo3.java BootstrapMethods
 L N M $java/lang/invoke/StringConcatFactory / O �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; K R [] InnerClasses U %java/lang/invoke/MethodHandles$Lookup W java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	           i� Y� � L� M>� ,2�  #k� %�O����>� 26� � ),2.� -  � 1���� )7� 9+� <���ϱ    
   6    	  
     '  /  4  :  K  T  \  `  h     >    i ? @    ^ A B   W C     D E  1 7 D E  7  F E  G    �   	� �   H    I J     P  Q S   
  T V X 