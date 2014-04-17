package se.tls.bigdata;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;

import java.io.IOException;

/**
 * Created by boaworm
 * (C) TLS
 */
public class Main {

    public static void main(String[] args) {
        Configuration conf = HBaseConfiguration.create();
        try {
            HTable table1 = new HTable(conf, "myTable");

            byte[] tableName = table1.getTableName();
            System.out.println("TableName = " + tableName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
