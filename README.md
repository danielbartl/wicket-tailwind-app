A simple example for interop of Apache Wicket and Tailwind based upon Wicket's own quick start project

You can find detailed instructions about how to install Tailwind CLI here:
https://tailwindcss.com/docs/installation

After successful installation you can start tailwind's JIT engine for this project with the following command:
npx tailwindcss -i ./tailwind-input.css -o ./src/main/webapp/style.css --watch

This will update your CSS file accordingly as soon as you update your HTML templates with tailwind classes.

