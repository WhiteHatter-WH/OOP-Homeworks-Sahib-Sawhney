
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class URLParse {
    public static void main(String[] args) {
        String line;
                try {

                    URL url = new URL(args[0]);


                    BufferedReader readr =  new BufferedReader(new InputStreamReader(url.openStream()));

                    BufferedWriter writer = new BufferedWriter(new FileWriter("out.html"));



                    while ((line = readr.readLine()) != null) {

                        String tempReplacement = "Temp";
                            line = line.replace("Α", tempReplacement );
                            line = line.replace("α", "Α");
                            line = line.replace(tempReplacement, "α");

                            line = line.replace("Β", tempReplacement );
                            line = line.replace("β", "Β");
                            line = line.replace(tempReplacement, "β");

                            line = line.replace("Γ", tempReplacement );
                            line = line.replace("γ", "Γ");
                            line = line.replace(tempReplacement, "γ");

                        line = line.replace("Δ", tempReplacement );
                        line = line.replace("δ", "Δ");
                        line = line.replace(tempReplacement, "δ");

                        line = line.replace("Ε", tempReplacement );
                        line = line.replace("ε", "Ε");
                        line = line.replace(tempReplacement, "ε");

                        line = line.replace("Ζ", tempReplacement );
                        line = line.replace("ζ", "Ζ");
                        line = line.replace(tempReplacement, "ζ");

                        line = line.replace("Η", tempReplacement );
                        line = line.replace("η", "Η");
                        line = line.replace(tempReplacement, "η");

                        line = line.replace("Θ", tempReplacement );
                        line = line.replace("θ", "Θ");
                        line = line.replace(tempReplacement, "θ");

                        line = line.replace("Ι", tempReplacement );
                        line = line.replace("ι", "Ι");
                        line = line.replace(tempReplacement, "ι");

                        line = line.replace("Κ", tempReplacement );
                        line = line.replace("κ", "Κ");
                        line = line.replace(tempReplacement, "κ");

                        line = line.replace("Λ", tempReplacement );
                        line = line.replace("λ", "Λ");
                        line = line.replace(tempReplacement, "λ");

                        line = line.replace("Μ", tempReplacement );
                        line = line.replace("μ", "Μ");
                        line = line.replace(tempReplacement, "μ");

                        line = line.replace("N", tempReplacement );
                        line = line.replace("v", "N");
                        line = line.replace(tempReplacement, "v");

                        line = line.replace("Ξ", tempReplacement );
                        line = line.replace("ξ", "Ξ");
                        line = line.replace(tempReplacement, "ξ");

                        line = line.replace("Ο", tempReplacement );
                        line = line.replace("ο", "Ο");
                        line = line.replace(tempReplacement, "ο");

                        line = line.replace("Π", tempReplacement );
                        line = line.replace("π", "Π");
                        line = line.replace(tempReplacement, "π");

                        line = line.replace("P", tempReplacement );
                        line = line.replace("p", "P");
                        line = line.replace(tempReplacement, "p");

                        line = line.replace("Σ", tempReplacement );
                        line = line.replace("σς", "Σ");
                        line = line.replace(tempReplacement, "σς");

                        line = line.replace("Τ", tempReplacement );
                        line = line.replace("τ", "Τ");
                        line = line.replace(tempReplacement, "τ");

                        line = line.replace("Υ", tempReplacement );
                        line = line.replace("υ", "Υ");
                        line = line.replace(tempReplacement, "υ");

                        line = line.replace("Φ", tempReplacement );
                        line = line.replace("φ", "Φ");
                        line = line.replace(tempReplacement, "φ");

                        line = line.replace("Χ", tempReplacement );
                        line = line.replace("χ", "Χ");
                        line = line.replace(tempReplacement, "χ");

                        line = line.replace("Ψ", tempReplacement );
                        line = line.replace("ψ", "Ψ");
                        line = line.replace(tempReplacement, "ψ");

                        line = line.replace("Ω", tempReplacement );
                        line = line.replace("ω", "Ω");
                        line = line.replace(tempReplacement, "ω");


                        writer.write(line);
                    }

                    readr.close();
                    writer.close();
                    System.out.println("Successfully Downloaded.");


                    String protocol = url.getProtocol();
                    String userinfo = url.getUserInfo();
                    String host = url.getHost();
                    int port = url.getPort();
                    String path = url.getPath();
                    String query = url.getQuery();

                    System.out.println("URL created: " + url);
                    System.out.println("protocol: " + protocol);
                    System.out.println("userinfo: " + userinfo);
                    System.out.println("host: " + host);
                    System.out.println("port: " + port);
                    System.out.println("path: " + path);
                    System.out.println("query: " + query);

                }

                catch (MalformedURLException e) {
                    System.out.println("Malformed URL: " + e.getMessage());
                }
                catch (IOException ie) {
                    System.out.println("IOException raised");
                }
    }

}
