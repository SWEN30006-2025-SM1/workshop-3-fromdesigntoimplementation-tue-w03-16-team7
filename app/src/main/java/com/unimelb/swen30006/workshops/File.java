package com.unimelb.swen30006.workshops;

// Sample private file class to be replaced by your implementaiton
class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    public String content() {
        // Implementation for retrieving file content
        return fileData;
    }

    public int fileSize() {
        // Implementation for retrieving file size
        return fileData.length();
    }

    public String fileType() {
        // Implementation for retrieving file type
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}