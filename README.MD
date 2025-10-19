## Generate RSA key


Do It Yourself
For these steps, you will need a command line shell with OpenSSL. Ideally, you should have a private key of your own and a public key from someone else. For demonstration, we will only use a single key pair.

Generate Private Key
Run this command to generate a 4096-bit private key and output it to the private.pem file. If you like, you may change the key length and/or output file.
```bash
$ openssl genrsa
```
Derive Public Key
Given a private key, you may derive its public key and output it to public.pem using this command. (You may also paste your OpenSSL-generated private key into the form above to get its public key.)

```
$ openssl rsa -in private.pem -pubout -out public.pem
```