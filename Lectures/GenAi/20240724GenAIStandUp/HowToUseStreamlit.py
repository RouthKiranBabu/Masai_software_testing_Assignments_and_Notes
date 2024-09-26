#To run this program use streamlit run HowToUseStreamlit.py

import streamlit as st 
tie = "Welcome to Streamlit Dashboard!"
st.title(tie)
st.write('Enter your name')
name = st.text_input("Enter Your name: ")
if st.button("Yes, Entered!"):
    st.write(f"Hello, {name}")
    tie = f"Thanks for visiting {name}"
    st.title(tie)
    