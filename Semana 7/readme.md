´´´
byte[] buffer = new byte[1024];
int bytesLeidos;
while ((bytesLeidos = is.read(buffer)) != -1) {
  baos.write(buffer, 0, bytesLeidos);
}
is.close();
baos.close();
String recibido = new String(baos.toByteArray());
´´´
