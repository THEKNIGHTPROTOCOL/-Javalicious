grant codeBase "file:/C:/myapp/" {
    permission java.io.FilePermission "C:/data/*", "read,write";
    permission java.net.SocketPermission "localhost:1024-", "connect,accept";
};
