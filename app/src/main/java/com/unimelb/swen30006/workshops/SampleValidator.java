package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.List;

/** Simple Sample Validator that only considers the file types
 * Created by mat on 10/02/2016.
 */
public class SampleValidator implements SubmissionValidator{

    @Override
    public Object[] validateSubmission(Submission submission) {
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        // Loop through all files and create an error if there are any no pdfs
        List<File> files = submission.includedFiles();
        for(File f : files){
            String type = f.fileType();
            if(!type.equals("pdf")){
                ValidationError error = new ValidationError(f);
                error.addError("File Type", "Unsupported filetype.");
                errors.add(error);
            }
        }

        if(errors.size() > 0){
           return errors.toArray();
        } else {
            return null;
        }
    }
}
