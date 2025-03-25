package org.example;

import org.example.decorators.CompressionDecorator;
import org.example.decorators.DataSource;
import org.example.decorators.DataSourceDecorator;
import org.example.decorators.EncryptionDecorator;
import org.example.decorators.FileDataSource;

/**
 * CLIENT CODE
 *
 */
public class Demo {
    public static void main( String[] args ) {
        String salaryRecords = "Name,Salary\\nJohn Smith,100000\\nSteven Jobs,912000";

        DataSourceDecorator encoded = new CompressionDecorator(
                                            new EncryptionDecorator(
                                                    new FileDataSource("OutputDemo.txt")));

        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
