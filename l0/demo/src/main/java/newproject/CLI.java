package newproject;

import java.io.IOException;
import java.util.Scanner;

public final class CLI 
{
    private CLI() throws InstantiationError
    {
        //git wersja ze strony3
    }

    public static void run()
    {
        Scanner scanner = new Scanner(System.in);
        CommandList.write();
        try
        {
            while(true)
            {
                try
                {
                    System.out.print("> ");
                    String input = scanner.nextLine().trim();

                    if (input.isEmpty()) 
                    {
                        continue;
                    }

                    String[] parts = input.split("\\s+", 3);

                    String command = parts[0];
                    //Double no1 = Double.parseDouble(parts[1]); 
                    //Double no2 = Double.parseDouble(parts[2]);


                    if(!(command.equals("exit")))
                    {
                        if(!(command.equals("command_list")))
                        {
                            if(parts.length < 3)
                            {
                                throw new IllegalArgumentException();
                            }

                        }
                    }
                   


                    switch (command)
                    {
                        case "add":
                            System.out.println(Double.parseDouble(parts[1]) + Double.parseDouble(parts[2]));
                            break;

                        case "substract":
                            System.out.println(Double.parseDouble(parts[1]) - Double.parseDouble(parts[2]));
                            break;

                        case "multiply":
                            System.out.println(Double.parseDouble(parts[1]) * Double.parseDouble(parts[2]));
                            break;
                        
                        case "divide":
                            System.out.println(Double.parseDouble(parts[1]) / Double.parseDouble(parts[2]));
                            break;
                    
                        case "command_list":
                            CommandList.write();
                            break;
                        
                        case "exit":
                            throw new IOException();

                        default:
                            System.out.println("Invalid command. Type 'command_list' to see the command list. Otherwise fuck off");
                            break;
                    }

                                        

                }

                catch(IllegalArgumentException e)
                {
                    System.err.println("Invalid argument/Not enough arguments");
                }
            }

           
        }
        catch (IOException ex)
        {
            System.out.println("Client closed \n");
        }

        finally
        {
            scanner.close();
        }
    }

}
