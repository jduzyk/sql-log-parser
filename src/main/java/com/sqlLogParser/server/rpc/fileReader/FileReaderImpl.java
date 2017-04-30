package com.sqlLogParser.server.rpc.fileReader;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.sqlLogParser.client.rpc.fileReader.FileReaderService;
import com.sqlLogParser.logs.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Jakub on 30.04.2017.
 */
public class FileReaderImpl extends RemoteServiceServlet implements FileReaderService
{

    private static Logger logger = Logger.getLogger("FILE READER");

    @Override
    public List<Log> getLogsFromFile(String path)
    {

        List<Log> logs = new ArrayList<Log>();

        logger.log(Level.INFO, "Loading file: " + path);


        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(path));
        }

        catch (FileNotFoundException ex)
        {
            logger.log(Level.INFO, "File not found! ");
        }

        catch (Exception ex)
        {
            logger.log(Level.INFO, "Other exception... ");
        }



        logger.log(Level.INFO, " Done !");

        return logs;
    }

}