

A Spring Boot application uses the secret name to access the database username and password stored in AWS Secrets Manager

The Spring Boot application connects to the RDS database using the credential it retrieves from AWS Secrets Manager using AWS Java SDK.


For use AWS Secret Manager  you need create user IAM Programming and configure environment variables [https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-envvars.html].

Windows:

    $ set AWS_ACCESS_KEY_ID=AKIA6HUM    UB5J42CPRCR6
    $ set AWS_SECRET_ACCESS_KEY=wdm5PfFlqAtaANXnzR7l5cLfSzcPbsf/lc9iGDMD4
    $ set AWS_REGION=us-east-1

Linux/Mac:

    $ export AWS_ACCESS_KEY_ID=AKIA6HUMUB5J42CPRCR6
    $ export AWS_SECRET_ACCESS_KEY=wdm5PfFlqAtaANXnzR7l5cLfSzcPbsf/lc9iGDMD4
    $ export AWS_REGION=us-east-1

 